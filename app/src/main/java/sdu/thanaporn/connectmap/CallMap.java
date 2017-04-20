package sdu.thanaporn.connectmap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CallMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_map);

        EditText Lattitude = (EditText) findViewById(R.id.mapLat);
        EditText Longtitude = (EditText) findViewById(R.id.mapLong);

        Uri location = Uri.parse("http://maps.google.com/maps?q=loc:13.759774,100.541484");

        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        mapIntent.setPackage("com.google.android.apps.maps");  //ใช้ไม่ได้กับ Genimotion
        startActivity(mapIntent);


    }// Main Method

    public void callMap(View view){

    }//End callMap

}// Main Class