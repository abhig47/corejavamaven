package jsoncoreprograms;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONobject {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Abhi", 1);
        jsonObject.put("Rohit", 2);
        jsonObject.put("Jay", 3);
        System.out.println(jsonObject);

        JSONArray subjectsJSONArray = new JSONArray();
        subjectsJSONArray.put("Subject1");
        subjectsJSONArray.put("Subject2");
        subjectsJSONArray.put("Subject3");
        subjectsJSONArray.put("Subject4");
        subjectsJSONArray.put("Subject5");

        JSONObject addressObj = new JSONObject();
        addressObj.put("HouseNo", 1);
        addressObj.put("City", "Ahmedabad");
        addressObj.put("State", "Gujarat");

        JSONObject studentJSON = new JSONObject();
        studentJSON.put("id", 1);
        studentJSON.put("age", 18);
        studentJSON.put("rollNo", 1);
        studentJSON.put("name", "Student 1");
        studentJSON.put("std", 10);

//        studentJSON.put("Students",students);

        studentJSON.put("Subjects", subjectsJSONArray);

        studentJSON.put("Address", addressObj);

        //System.out.println(studentJSON);

        JSONObject studentJSON2 = new JSONObject();
        studentJSON2.put("id", 1);
        studentJSON2.put("age", 11);
        studentJSON2.put("rollNo", 1);
        studentJSON2.put("name", "Student 1");
        studentJSON2.put("std", 10);

        JSONObject studentJSON3 = new JSONObject();
        studentJSON3.put("id", 2);
        studentJSON3.put("age", 18);
        studentJSON3.put("rollNo", 3);
        studentJSON3.put("name", "Student 3");
        studentJSON3.put("std", 12);

        JSONObject studentJSON4 = new JSONObject();
        studentJSON4.put("id", 4);
        studentJSON4.put("age", 10);
        studentJSON4.put("rollNo", 1);
        studentJSON4.put("name", "Student 4");
        studentJSON4.put("std", 4);

        JSONObject studentJSON5 = new JSONObject();
        studentJSON5.put("id", 5);
        studentJSON5.put("age", 13);
        studentJSON5.put("rollNo", 5);
        studentJSON5.put("name", "Student 5");
        studentJSON5.put("std", 6);


        studentJSON2.put("Subjects", subjectsJSONArray);

        studentJSON2.put("Address", addressObj);


        studentJSON3.put("Subjects", subjectsJSONArray);

        studentJSON3.put("Address", addressObj);

        studentJSON4.put("Subjects", subjectsJSONArray);

        studentJSON4.put("Address", addressObj);

        studentJSON5.put("Subjects", subjectsJSONArray);

        studentJSON5.put("Address", addressObj);

        JSONArray studentJSONArray = new JSONArray();
        studentJSONArray.put(studentJSON);
        studentJSONArray.put(studentJSON2);
        studentJSONArray.put(studentJSON3);
        studentJSONArray.put(studentJSON4);
        studentJSONArray.put(studentJSON5);

        JSONObject jsonobj = new JSONObject();
        jsonobj.put("Students", studentJSONArray);
        System.out.println(jsonobj);

//        System.out.println(studentJSONArray.get(1));

        int id = (int) studentJSON.get("id");
        int age = (int) studentJSON.get("age");
        String name = (String) studentJSON.get("name");
        int rollnum = (int) studentJSON.get("rollNo");
        int std = (int) studentJSON.get("std");
        System.out.println("ID : " + id);
        System.out.println("Age : " + age);
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollnum);
        System.out.println("Standard : " + std);
        System.out.println("\n\nID : " + studentJSON2.get("id"));
        System.out.println("Age : " + studentJSON2.get("age"));
        System.out.println("Name : " + studentJSON2.get("name"));
        System.out.println("Roll Number : " + studentJSON2.get("rollNo"));
        System.out.println("Standard : " + studentJSON2.get("std"));

        System.out.println("\n\nID : " + studentJSON3.get("id"));
        System.out.println("Age : " + studentJSON3.get("age"));
        System.out.println("Name : " + studentJSON3.get("name"));
        System.out.println("Roll Number : " + studentJSON3.get("rollNo"));
        System.out.println("Standard : " + studentJSON3.get("std"));

        System.out.println("\n\nID : " + studentJSON4.get("id"));
        System.out.println("Age : " + studentJSON4.get("age"));
        System.out.println("Name : " + studentJSON4.get("name"));
        System.out.println("Roll Number : " + studentJSON4.get("rollNo"));
        System.out.println("Standard : " + studentJSON4.get("std"));

        System.out.println("\n\nID : " + studentJSON5.get("id"));
        System.out.println("Age : " + studentJSON5.get("age"));
        System.out.println("Name : " + studentJSON5.get("name"));
        System.out.println("Roll Number : " + studentJSON5.get("rollNo"));
        System.out.println("Standard : " + studentJSON5.get("std"));

        System.out.println("\nStudent Data in JSONObject");

        // Returns the array value at the specified position in this array.
        JSONArray jsArray = new JSONArray();
        JSONObject jsonObject1;
        for (int i = 0; i < studentJSONArray.length(); i++) {
            //System.out.println(addJSONArrays.get(i));
            jsonObject1 = (JSONObject) studentJSONArray.get(i);
            System.out.println(jsonObject1.get("std"));
            System.out.println(jsonObject1.getJSONObject("Address"));
            jsArray.put(jsonObject1);
        }

        System.out.println("\nJSONArray");
        System.out.println(jsArray);
        System.out.println("\nLnegth of JSONArrays : " + jsArray.length());
        System.out.println(jsArray.get(4));
        jsArray.remove(4);
        System.out.println("\nAfter Deleting Recoreds");
        System.out.println(jsArray);
        System.out.println("\nLnegth of JSONArrays : " + jsArray.length());
    }
}