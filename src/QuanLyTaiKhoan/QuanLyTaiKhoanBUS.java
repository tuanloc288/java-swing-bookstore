package QuanLyTaiKhoan;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



public class QuanLyTaiKhoanBUS extends mainBUS_DAO.mainBUS {

    public ArrayList<TaiKhoan> dstk = new ArrayList<>();
    QuanLyTaiKhoanDAO qltkDAO = new QuanLyTaiKhoanDAO();

    public QuanLyTaiKhoanBUS() {
        this.DAO = new QuanLyTaiKhoanDAO();
        this.dstk = qltkDAO.readDB();
    }

    public List<String> getColumns() {
        List<String> columns = new LinkedList<>();
        columns.add("user");
        columns.add("password");
        columns.add("accountType");
        columns.add("employeeID");
        columns.add("remember");
        columns.add("enabled");
        return columns;
    }

    public void readDB() {
        this.dstk.clear();
        this.dstk = qltkDAO.readDB();
    }

    public ArrayList<TaiKhoan> getDSTK() {
        return this.dstk;
    }

    public int Add(List<Object> data, List<String> column) {
        int flag = qltkDAO.insertData(data, column);
        readDB();
        return flag;
    }

    public int Update(List<Object> dataSet, List<String> updateColumns, List<String> conditionColumns) {
        int flag = qltkDAO.updateData(dataSet, updateColumns, conditionColumns);
        readDB();
        return flag;
    }

    public int Delete(List<Object> conditionData, List<String> conditionColumns) {
        int flag = qltkDAO.deleteData(conditionData, conditionColumns);
        readDB();
        return flag;
    }

    public String getSingleData(List<Object> dataSet, List<String> dataColumns, List<String> selectedColumns, boolean distinct) {
        String searchData = "";
        Map<String, List<Object>> rs = new HashMap<>();
        int temp = qltkDAO.selectData(dataSet, dataColumns, selectedColumns, rs, distinct);
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
