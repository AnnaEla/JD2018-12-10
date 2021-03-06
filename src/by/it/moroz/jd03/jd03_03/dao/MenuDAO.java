package by.it.moroz.jd03.jd03_03.dao;

import by.it.moroz.jd03.jd03_03.beans.Menu;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MenuDAO extends AbstractDAO implements InterfaceDAO<Menu> {

    @Override
    public Menu read(long id) throws SQLException {
        List<Menu> menu = getAll("WHERE `id`=" + id);
        return menu.size()==0?null:menu.get(0);
    }

    @Override
    public boolean create(Menu menu) throws SQLException {
        String sql = String.format("INSERT INTO `moroz`.`menu` (`name`, `price`)" +
                " VALUES ('%s', '%f')", menu.getName(), menu.getPrice());
        menu.setId(executeCreate(sql));
        return menu.getId()>0;
    }

    @Override
    public boolean update(Menu menu) throws SQLException {
        String sql = String.format("UPDATE `menu` SET `name`='%s', `price`='%f', " +
                "WHERE `id`='%d'", menu.getName(), menu.getPrice(), menu.getId());
        return executeUpdate(sql);
    }

    @Override
    public boolean delete(Menu menu) throws SQLException {
        String sql = String.format("DELETE FROM `menu` WHERE `id`='%d'", menu.getId());
        return executeUpdate(sql);
    }

    @Override
    public List<Menu> getAll() throws SQLException {
        return null;
    }

    @Override
    public List<Menu> getAll(String WHERE) throws SQLException {
        List<Menu> result = new ArrayList<>();
        try (Connection connection = ConnCreator.getConnection();
             Statement statement = connection.createStatement()) {
            String read = "SELECT * FROM `menu` "+WHERE;
            ResultSet resultSet = statement.executeQuery(read);
            if (resultSet.next()) {
                Menu menu = new Menu();
                menu.setId(resultSet.getLong("id"));
                menu.setName(resultSet.getString("name"));
                menu.setPrice(resultSet.getDouble("price"));
                return result;
            }
        }
        return null;
    }
}
