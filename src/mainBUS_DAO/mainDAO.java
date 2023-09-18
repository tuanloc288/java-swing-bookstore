/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainBUS_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public abstract class mainDAO {
    protected String tbName;
    protected Connection conn;
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/doanjava";
    
    public mainDAO(){
        this.tbName = "";
        this.conn = null;
    }
    
    protected void getConnection(){
        try {   
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conn = DriverManager.getConnection(url, user, password);
        }
        catch(Exception e){
            System.out.println("Kết nối đến database thất bại");
            e.printStackTrace();
        }
    } 
    
    protected abstract void appendData(List<Object> data , List<String> columns , PreparedStatement stat) 
               throws SQLException;
    protected abstract void mappingData(ResultSet rs , List<String> columns , Map<String, List<Object>> results) 
            throws SQLException;

    public int selectData(List<Object> dataSet , List<String> dataColumns, List<String> selectedColumns, Map<String, List<Object>> results, boolean distinct){
        try {
            StringBuilder sql = new StringBuilder();
            if(distinct == true)
                sql.append("SELECT DISTINCT ");
            else sql.append("SELECT ");
            
            int count;
            if(selectedColumns == null){
                sql.append("* ");
            }
            else {
                count = 1;
                for(String column : selectedColumns){
                    sql.append(column);
                     
                    if(count < selectedColumns.size())
                        sql.append(", ");
                    
                    count++;
                }
            }
            
            sql.append(" FROM ");
            sql.append(this.tbName);
            if(dataColumns != null){
                sql.append(" WHERE ");
                
                count = 1;
                for(String column: dataColumns) {
                    sql.append(column);
                    sql.append(" = ? ");
                    
                    if(count < dataColumns.size())
                        sql.append(" AND ");
                    
                    count++;
                }   
            }
            this.getConnection();
            PreparedStatement ptm = this.conn.prepareStatement(sql.toString());
            this.appendData(dataSet, dataColumns, ptm);
            try {
                ResultSet rs = ptm.executeQuery();
                this.mappingData(rs, selectedColumns, results);
                ptm.close();
                this.conn.close();
                return 1;
            }
            catch (SQLException e){
                return 2;
            }
        }
        catch(Exception e){
            return 0;
        }
    }
    
    public int insertData(List<Object> dataSet , List<String> columns){
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO ");
            sql.append(this.tbName);
            sql.append(" ( ");
            
            int count = 1;
            for(String column : columns){
                sql.append(column);
                
                if(count < columns.size())
                    sql.append(", ");
                
                count++;
            }
            sql.append(" ) ");
            sql.append(" VALUES ( ");
            count = 1;
            for(String column: columns){
                sql.append("?");
                if(count < columns.size())
                    sql.append(", ");
                
                count++;
            }
            sql.append(")");
            
            this.getConnection();
            PreparedStatement ptm = this.conn.prepareStatement(sql.toString());
            this.appendData(dataSet, columns, ptm);
            try {
                ptm.executeUpdate();
                ptm.close();
                this.conn.close();
                return 1;
            }
            catch (SQLException e){
                return 2;
            }
        }
        catch(Exception e){
            return 0;
        }
    }
    
    public int updateData(List<Object> dataSet, List<String> updateColumns , List<String> conditionColumns){
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE ");
            sql.append(this.tbName);
            sql.append(" SET ");
            
            int count = 1;
            for(String column: updateColumns){
                sql.append(column);
                sql.append(" = ?");
                
                if(count < updateColumns.size())
                    sql.append(", ");
                
                count++;
            }
            if(conditionColumns != null){
                sql.append(" WHERE ");
                
                count = 1;
                for(String column : conditionColumns){
                    sql.append(column);
                    sql.append(" = ? ");
                    
                    if(count < conditionColumns.size())
                        sql.append(" AND ");
                    
                    count++;
                }
            }
            this.getConnection();
            PreparedStatement ptm = this.conn.prepareStatement(sql.toString());
            
            List<String> dataColumns = new LinkedList<>();
            dataColumns.addAll(updateColumns);
            dataColumns.addAll(conditionColumns);

            this.appendData(dataSet, dataColumns, ptm);
            try {
                ptm.executeUpdate();
                ptm.close();
                this.conn.close();
                return 1;
            }
            catch (SQLException e){
                return 2;
            }
        }
        catch(Exception e){
           return 0;
        }
    }
    
    public int deleteData(List<Object> conditionData , List<String> conditionColumns){
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("DELETE FROM ");
            sql.append(this.tbName);
            sql.append(" WHERE ");
            
            int count = 1;
            for(String column : conditionColumns){
                sql.append(column);
                sql.append(" = ? ");
                
                if(count < conditionColumns.size())
                    sql.append(" AND ");
                
                count++;
            }
            this.getConnection();
            PreparedStatement ptm = this.conn.prepareStatement(sql.toString());
            this.appendData(conditionData, conditionColumns, ptm);
            try {
                ptm.executeUpdate();
                ptm.close();
                this.conn.close();
                return 1;
            }
            catch(SQLException e){
                return 2;
            }
        }
        catch (Exception e){
            return 0;
        }
    }
    
    public ResultSet getResult() throws SQLException {
        String sql = "SELECT * FROM " + this.tbName;
        ResultSet rs = null;
        try {
            this.getConnection();
            Statement stm = this.conn.createStatement();
            rs = stm.executeQuery(sql);
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
}
