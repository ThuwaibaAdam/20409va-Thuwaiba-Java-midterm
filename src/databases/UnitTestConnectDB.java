package databases;

import java.util.List;

public class UnitTestConnectDB {

    /**
     * Use this class to unit test the SharedStepsDatabase class
     */

    public static void main(String[] args) throws Exception {

        // region readAllTest
        SharedStepsDatabase ssdb = new SharedStepsDatabase();

      // String query = "SELECT * FROM EMPLOYEES.EMPLOYEES E INNER JOIN DEPT_EMP DE ON E.EMP_NO = DE.EMP_NO " +
                      //"WHERE E.FIRST_NAME LIKE 'Alain'";
        String query = "SELECT * FROM ACTOR ";
       // ssdb.executeQuery(query);
        ssdb.executeQueryReadAll(query);
        List<List<String>> data = ssdb.executeQueryReadAll(query);

        //List<List<String>> data = ssdb.executeQueryReadAll(query);
        for (List<String>row : data){
            for (String cell : row){
                System.out.println(cell +"\t\t");
            }
            System.out.println("\n");
        }

       if (data != null) {
            for (List<String> row : data) {
                for (String cell : row) {
                   System.out.print(cell + "\t\t\t\t");
               }
               System.out.println();
           }
        }

        // endregion
    }
}
