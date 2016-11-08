package drawer_monqui.a20108452.example.com.card_view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bttn = (Button) findViewById(R.id.button);
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.invitecaretakerstatus);
                dialog.show();
            }
        });
        Button bttn2 = (Button) findViewById(R.id.button2);
        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.messagecard2_denied);
                dialog.show();
            }
        });
        Button bttn3 = (Button) findViewById(R.id.button3);
        bttn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.overview_card);
                dialog.show();
            }
        });
        Button bttn4 = (Button) findViewById(R.id.button4);
        bttn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.caretakerinvitation);
                dialog.show();
            }
        });
        Button bttn5 = (Button) findViewById(R.id.button5);
        bttn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.approvals);
                dialog.show();
            }
        });
        Button bttn6 = (Button) findViewById(R.id.button6);
        bttn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.messegecard2_approve);
                dialog.show();
            }
        });
    }

}
