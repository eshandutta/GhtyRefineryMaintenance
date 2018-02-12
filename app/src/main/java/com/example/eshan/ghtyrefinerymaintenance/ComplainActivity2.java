package com.example.eshan.ghtyrefinerymaintenance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ComplainActivity2 extends AppCompatActivity {

    public EditText editbuilding;
    public EditText editcomplaincategory;
    public EditText editcomplainsubcategory;
    Button sendinfo;
    DatabaseReference databasedetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain2);

        databasedetails= FirebaseDatabase.getInstance().getReference("details");
        editbuilding = (EditText) findViewById(R.id.buildingno);
        editcomplainsubcategory=(EditText)findViewById(R.id.comsubcat);
        sendinfo=(Button) findViewById(R.id.submitbutton);
        sendinfo = (Button) findViewById(R.id.submitbutton);
        sendinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //adddetails();
            }
        });
    }
    /*private void adddetails(){
        String building=editbuilding.getText().toString().trim();
        String complainsubcat=editcomplainsubcategory.getText().toString().trim();

        if(!TextUtils.isEmpty(building))
        {
            String id=databasedetails.push().getKey();
            //Details details=new Details(id,complainnumber,complaindate,quarternumber);
            Details details=new Details(id,building,complainsubcat);
            databasedetails.child(id).setValue(details);
            Toast.makeText(this,"Info added",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"You Should enter a building",Toast.LENGTH_SHORT).show();
        }

    }*/
}
