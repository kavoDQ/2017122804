package forfun.good.a2017122804;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CL1(View v)
    {
        Uri web= Uri.parse("http://gamer.com.tw");
        Intent it = new Intent(Intent.ACTION_VIEW, web);
        startActivity(it);
    }
    public void CL2(View v)
    {
        EditText ed= findViewById(R.id.editText);
        //Uri map = Uri.parse("geo:0,0?"d);
        Uri map= Uri.parse("geo:0,0?q=" + Uri.encode(ed.getText().toString()));
        Intent it = new Intent(Intent.ACTION_VIEW, map);
        startActivity(it);
    }
    public void CL3(View v)
    {
        Uri tel = Uri.parse("tel:0800 888 000");
        Intent it = new Intent(Intent.ACTION_DIAL, tel);
        startActivity(it);
    }
}
