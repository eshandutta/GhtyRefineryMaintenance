package com.example.eshan.ghtyrefinerymaintenance;

/**
 * Created by Eshan on 28-Apr-17.
 */

public class Details {
    /*String complain_number;
    String complain_date;
    String quarter_number;
    String building_type;
    String complain_cat;
    String sub_complaint;
    String complainer_name;
*/
    String complain_number;
    String complain_cat;
    String reg_comp;
    String request_no;
    String request_date;
    String build_cat;
    String request_place;
    String request_category;
    String request_subcategory;
    String requestor_name;
    String dept;
    String location_room;
    String section;
    String job_request;
    String phone_number;
   /* public Details(String id, String complainnumber, String complaindate, String quarternumber, String buildingtype, String complaincategory, String subcompcat) {


    }
*/
   /* public Details(String id, String complain_number, String complain_date, String quarter_number,String building_type,String complain_cat,String sub_complaint,String complainer_name) {
        this.complain_number = complain_number;
        this.complain_date = complain_date;
        this.quarter_number = quarter_number;
        this.building_type=building_type;
        this.complain_cat=complain_cat;
        this.sub_complaint=sub_complaint;
        this.complainer_name=complainer_name;
        //this.sub_complain=sub_complain;
    }*/



  /*  public String getComplain_number() {
        return complain_number;
    }

    public String getComplain_date() {
        return complain_date;
    }

    public String getQuarter_number() {return quarter_number;}

    public String getBuilding_type() {return building_type;}

    public String getComplain_cat() {return complain_cat;}

    public String getSub_complaint() {
        return sub_complaint;
    }

    public String getComplainer_name() {return complainer_name;*/

    public Details(String id, String complain_number, String complain_cat, String reg_comp,
                   String request_no, String request_date,String build_cat,String request_place,String request_category,
                   String request_subcategory,String requestor_name,String dept,String location_room,String section,String job_request,String phone_number) {
        this.complain_number = complain_number;
        this.complain_cat = complain_cat;
        this.reg_comp = reg_comp;
        this.request_no = request_no;
        this.request_date=request_date;
        this.build_cat=build_cat;
        this.request_place=request_place;
        this.request_category=request_category;
        this.request_subcategory=request_subcategory;
        this.requestor_name=requestor_name;
        this.dept=dept;
        this.location_room=location_room;
        this.section=section;
        this.job_request=job_request;
        this.phone_number=phone_number;
    }

    public String getComplain_number() {
        return complain_number;
    }

    public String getComplain_cat() {
        return complain_cat;
    }

    public String getReg_comp() {
        return reg_comp;
    }

    public String getRequest_no() {
        return request_no;
    }

    public String getRequest_date()
    {
        return request_date;
    }

    public String getBuild_cat()
    {
        return build_cat;
    }

    public String getRequest_place()
    {
        return request_place;
    }

    public String getRequest_category()
    {
        return request_category;
    }

    public String getRequestor_name()
    {
        return requestor_name;
    }

    public String getDept()
    {
        return dept;
    }

    public String getLocation_room()
    {
        return location_room;
    }

    public String getSection()
    {
        return section;
    }

    public String getJob_request()
    {
        return job_request;
    }

    public String getPhone_number()
    {
        return phone_number;
    }
}
