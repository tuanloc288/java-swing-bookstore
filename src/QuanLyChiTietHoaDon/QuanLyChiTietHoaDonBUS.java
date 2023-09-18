package QuanLyChiTietHoaDon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



public class QuanLyChiTietHoaDonBUS extends mainBUS_DAO.mainBUS{
    public ArrayList<ChiTietHoaDon> dscthd = new ArrayList<>();
    QuanLyChiTietHoaDonDAO qlcthdDAO = new QuanLyChiTietHoaDonDAO();
    
    public QuanLyChiTietHoaDonBUS(){
        this.DAO = new QuanLyChiTietHoaDonDAO();
        this.dscthd = qlcthdDAO.readDB();
    }
    
     public void readDB(){
        this.dscthd.clear();
        this.dscthd = qlcthdDAO.readDB();
    }
    
    public List<String> getColumns(){
        List<String> columns = new LinkedList<>();
        columns.add("billID");
        columns.add("productID");
        columns.add("quantity");
        columns.add("price");
        columns.add("total");
        return columns;
    }
    
    public ArrayList<ChiTietHoaDon> getDSCTHD(){
        return this.dscthd;
    }
    
    public int Add(List<Object> data , List<String> column){
        int flag = qlcthdDAO.insertData(data, column);
        readDB();
        return flag;
    }
    
    public int Update(List<Object> dataSet , List<String> updateColumns , List<String> conditionColumns){
        int flag = qlcthdDAO.updateData(dataSet, updateColumns, conditionColumns);
        readDB();
        return flag;
    }
    
    public int Delete(List<Object> conditionData, List<String> conditionColumns){
        int flag = qlcthdDAO.deleteData(conditionData, conditionColumns);
        readDB();
        return flag;
    }
    
    public String getSingleData(List<Object> dataSet, List<String> dataColumns, List<String> selectedColumns,boolean distinct) {
        String searchData = "";
        Map<String, List<Object>> rs = new HashMap<>();
        int temp = qlcthdDAO.selectData(dataSet, dataColumns, selectedColumns, rs,distinct);
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
