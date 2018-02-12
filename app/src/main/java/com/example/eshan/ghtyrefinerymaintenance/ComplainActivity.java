package com.example.eshan.ghtyrefinerymaintenance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.StringTokenizer;

import static android.R.string.no;

public class ComplainActivity extends AppCompatActivity {
    public EditText editcomplainnumber;
    public Spinner spinnercomplaincat;
    public Spinner spinnerregistercomplain;
    public EditText editrequestnumber;
    public EditText editrequestdate;
    public Spinner spinnerbuildingcategory;
    public EditText editrequestplace;
    public Spinner spinnerrequestcategory;
    public Spinner spinnerrequestsubcategory;
    public EditText editrequestorname;
    public EditText editdepartment;
    public EditText editlocroom;
    public EditText editsection;
    public EditText editjobreq;
    public EditText editphonenumber;
    //Button next;
    Button submit;
    DatabaseReference databasedetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain);

        databasedetails= FirebaseDatabase.getInstance().getReference("details");


        editcomplainnumber=(EditText)findViewById(R.id.comno);
        spinnercomplaincat=(Spinner)findViewById(R.id.complain_category);
        spinnerregistercomplain=(Spinner)findViewById(R.id.register_complain);
        editrequestnumber=(EditText)findViewById(R.id.req_no);
        editrequestdate=(EditText)findViewById(R.id.req_date);
        spinnerbuildingcategory=(Spinner) findViewById(R.id.building_category);
        editrequestplace=(EditText)findViewById(R.id.req_place1);
        spinnerrequestcategory=(Spinner)findViewById(R.id.req_cat);
        spinnerrequestsubcategory=(Spinner)findViewById(R.id.req_subcat);
        editrequestorname=(EditText)findViewById(R.id.req_name);
        editdepartment=(EditText)findViewById(R.id.dept_name);
        editlocroom=(EditText)findViewById(R.id.loc_room);
        editsection=(EditText)findViewById(R.id.sec);
        editjobreq=(EditText)findViewById(R.id.job_req);
        editphonenumber=(EditText)findViewById(R.id.ph_no);

        submit = (Button) findViewById(R.id.submitbutton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adddetails();
            }
        });
       /* next = (Button) findViewById(R.id.nextbutton);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ComplainActivity.this, ComplainActivity2.class);
                startActivity(myIntent);
            }
        });*/

    }
    private void adddetails(){

        String complainnumber=editcomplainnumber.getText().toString().trim();
        String complaincat=spinnercomplaincat.getSelectedItem().toString();
        String regcomp=spinnerregistercomplain.getSelectedItem().toString();
        String requestno=editrequestnumber.getText().toString().trim();
        String requestdate=editrequestdate.getText().toString().trim();
        String buildingcategory=spinnerbuildingcategory.getSelectedItem().toString();
        String requestplace=editrequestplace.getText().toString().trim();
        String requestcategory=spinnerrequestcategory.getSelectedItem().toString();
        String requestsubcategory=spinnerrequestsubcategory.getSelectedItem().toString();
        String requestname=editrequestorname.getText().toString().trim();
        String department=editdepartment.getText().toString().trim();
        String locationroom=editlocroom.getText().toString().trim();
        String section=editsection.getText().toString().trim();
        String jobrequest=editjobreq.getText().toString().trim();
        String phonenumber=editphonenumber.getText().toString().trim();

       /* String complainnumber=editcomplainnumber.getText().toString().trim();
        String complaindate=editcomplaindate.getText().toString().trim();
        String quarternumber=editquarternumber.getText().toString().trim();
        String buildingtype=editbuildingtype.getText().toString().trim();
        String complaincategory=complaincat.getSelectedItem().toString();
        String subcompcat=subcomplaint.getText().toString().trim();
        String com_name=editcomplainer.getText().toString().trim();*/
        if(!TextUtils.isEmpty(complainnumber))
        {
          String id=databasedetails.push().getKey();
            //Details details=new Details(id,complainnumber,complaindate,quarternumber);
            //Details details=new Details(id,complainnumber,complaindate,quarternumber,buildingtype,complaincategory,subcompcat,com_name);
            //Details details=new Details(id,complainnumber,complaincat,regcomp,regcomp,requestno,requestdate,buildingcategory,requestplace,requestcategory,requestsubcategory,requestname,department,locationroom,section,jobrequest,phonenumber)

            Details details=new Details(id,complainnumber,complaincat,regcomp,requestno,requestdate,buildingcategory,requestplace,requestcategory,
                                         requestsubcategory,requestname,department,locationroom,section,jobrequest,phonenumber);
            databasedetails.child(id).setValue(details);
            Toast.makeText(this,"Info added",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"You Should enter the necessary details",Toast.LENGTH_SHORT).show();
        }

    }



}
