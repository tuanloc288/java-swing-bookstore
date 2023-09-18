package QuanLyKhachHang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



public class QuanLyKhachHangBUS extends mainBUS_DAO.mainBUS{
    public ArrayList<KhachHang> dskh = new ArrayList<>();
    QuanLyKhachHangDAO qlkhDAO = new QuanLyKhachHangDAO();
    
    public QuanLyKhachHangBUS(){
        this.DAO = new QuanLyKhachHangDAO();
        this.dskh = qlkhDAO.readDB();
    }
    
    public void readDB(){
        this.dskh.clear();
        this.dskh = qlkhDAO.readDB();
    }
    
    public List<String> getColumns(){
        List<String> columns = new LinkedList<>();
        columns.add("customerID");
        columns.add("name");
        columns.add("phone");
        columns.add("address");
        return columns;
    }
    
    public ArrayList<KhachHang> getDSKH(){
        return this.dskh;
    }
    
    public int Add(List<Object> data , List<String> column){
        int flag = qlkhDAO.insertData(data, column);
        readDB();
        return flag;
    }
    
    public int Update(List<Object> dataSet , List<String> updateColumns , List<String> conditionColumns){
        int flag = qlkhDAO.updateData(dataSet, updateColumns, conditionColumns);
        readDB();
        return flag;
    }
    
    public int Delete(List<Object> conditionData, List<String> conditionColumns){
        int flag = qlkhDAO.deleteData(conditionData, conditionColumns);
        readDB();
        return flag;
    }
    
    public String getSingleData(List<Object> dataSet, List<String> dataColumns, List<String> selectedColumns,boolean distinct) {
        String searchData = "";
        Map<String, List<Object>> rs = new HashMap<>();
        int temp = qlkhDAO.selectData(dataSet, dataColumns, selectedColumns, rs,distinct);
        if(temp == 1){
            if(!rs.isEmpty()){
                for(String key : rs.keySet()){
                    List<Object> records = rs.get(key);
                    for(Object record: records){
                        searchData = String.valueOf(record);
                    }
                }
            }
            return searchData;
        }
        else if(temp == 2){
            return "2";
        }
        else return "0";
    }
}
