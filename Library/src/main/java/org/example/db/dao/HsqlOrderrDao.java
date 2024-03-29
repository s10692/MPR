package org.example.db.dao;

import java.sql.Connection;




import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.example.db.DaoBase;
import org.example.db.EntityBase;
import org.example.db.HsqlUnitOfWork;
import org.example.library.Address;
import org.example.library.Books;
import org.example.library.Client;
import org.example.library.Orderr;

public class HsqlOrderrDao extends HsqlDaoBase<Orderr> implements OrderrDao{

        
        public HsqlOrderrDao(HsqlUnitOfWork uow) {
                super(uow);
        }

        public void setOrders(Orderr o) {
                
        }

        @Override
        protected void setUpdateQuery(Orderr ent) throws SQLException {

                update.setInt(1, ent.getorderNumber());
                update.setDate(2, ent.getDate());
                update.setInt(3, ent.getId());
                
        }

        @Override
        protected Orderr build(ResultSet rs) throws SQLException {

                Orderr o = new Orderr();
                o.setorderNumber(rs.getInt("ordernumber"));
                o.setDate(rs.getDate("date"));
                o.setId(rs.getInt("id"));
                return o;
        }

        @Override
        protected void setInsertQuery(Orderr ent) throws SQLException {
                insert.setInt(1, ent.getorderNumber());
                insert.setDate(2, ent.getDate());
                
                
        }

        @Override
        protected String getTableName() {
                return "orderr";
        }

        @Override
        protected String getCreateQuery() {
                return "CREATE TABLE Orderr("
                                + "id bigint GENERATED BY DEFAULT AS IDENTITY,"
                                + "ordernumber INT,"
                                + "date DATE,"
                                + ")";
        }

        @Override
        protected String getInsertQuery() {
                return "insert into orderr(ordernumber,date) values (?,?)";
        }

        @Override
        protected String getUpdateQuery() {
                return "update orderr set"
                                + "(ordernumber,date)=(?,?)"
                                + "where id=?";
        }
}