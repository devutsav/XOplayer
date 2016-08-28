package com.example.lenovo.cross1;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button notify;
    LinearLayout layout;
    int turn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        notify=(Button)findViewById(R.id.notify);
        //notify.setEnabled(false);
        notify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent();
                PendingIntent pendingIntent=PendingIntent.getActivity(MainActivity.this, 0, i, 0);
                NotificationCompat.Builder notification=new NotificationCompat.Builder(MainActivity.this);
                        notification.setContentTitle("XOplayer notifies");
                        notification.setContentText("GAME ON");
                        notification.setSmallIcon(R.drawable.andicon);
                        notification.setContentIntent(pendingIntent);

                NotificationManager notm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
                notm.notify(0,notification.build());
            }
        });
        layout=(LinearLayout)findViewById(R.id.layout);
        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(layout,"More options",Snackbar.LENGTH_LONG)
                        .setAction("NEW GAME", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                b1.setEnabled(true);
                                b2.setEnabled(true);
                                b3.setEnabled(true);
                                b4.setEnabled(true);
                                b5.setEnabled(true);
                                b6.setEnabled(true);
                                b7.setEnabled(true);
                                b8.setEnabled(true);
                                b9.setEnabled(true);
                                b1.setText("");
                                b2.setText("");
                                b3.setText("");
                                b4.setText("");
                                b5.setText("");
                                b6.setText("");
                                b7.setText("");
                                b8.setText("");
                                b9.setText("");
                            }
                        });
                snackbar.show();
            }
        });

        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);

        turn=1;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals(""))
                {
                    if (turn == 1)
                    {
                        turn = 2;
                        b1.setText("X");
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b1.setText("O");
                    }
                }
                endGame();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals(""))
                {
                    if (turn == 1)
                    {
                        turn = 2;
                        b2.setText("X");
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b2.setText("O");
                    }
                }
                endGame();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equals(""))
                {
                    if (turn == 1)
                    {
                        turn = 2;
                        b3.setText("X");
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b3.setText("O");
                    }
                }
                endGame();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equals(""))
                {
                    if (turn == 1)
                    {
                        turn = 2;
                        b4.setText("X");
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b4.setText("O");
                    }
                }
                endGame();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText().toString().equals(""))
                {
                    if (turn == 1)
                    {
                        turn = 2;
                        b5.setText("X");
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b5.setText("O");
                    }
                }
                endGame();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText().toString().equals(""))
                {
                    if (turn == 1)
                    {
                        turn = 2;
                        b6.setText("X");
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b6.setText("O");
                    }
                }
                endGame();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7.getText().toString().equals(""))
                {
                    if (turn == 1)
                    {
                        turn = 2;
                        b7.setText("X");
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b7.setText("O");
                    }
                }
                endGame();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText().toString().equals(""))
                {
                    if (turn == 1)
                    {
                        turn = 2;
                        b8.setText("X");
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b8.setText("O");
                    }
                }
                endGame();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().toString().equals(""))
                {
                    if (turn == 1)
                    {
                        turn = 2;
                        b9.setText("X");
                    }
                    else if (turn == 2)
                    {
                        turn = 1;
                        b9.setText("O");
                    }
                }
                endGame();
            }
        });
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }
    public void endGame()
    {
       String a,b,c,d,e,f,g,h,i;
        boolean fin=false;
        a=b1.getText().toString();
        b=b2.getText().toString();
        c=b3.getText().toString();
        d=b4.getText().toString();
        e=b5.getText().toString();
        f=b6.getText().toString();
        g=b7.getText().toString();
        h=b8.getText().toString();
        i=b9.getText().toString();

        if(a.equals("X") && b.equals("X") && c.equals("X"))
        {
            Toast.makeText(MainActivity.this, "WINNER IS X", Toast.LENGTH_LONG).show();
            fin=true;
        }
        else if(a.equals("O") && b.equals("O") && c.equals("O"))
        {
            Toast.makeText(MainActivity.this, "WINNER IS O", Toast.LENGTH_LONG).show();
            fin=true;
        }
        else if(a.equals("X") && e.equals("X") && i.equals("X"))
        {
            Toast.makeText(MainActivity.this, "WINNER IS X", Toast.LENGTH_LONG).show();
            fin=true;
        }
        else if(a.equals("O") && e.equals("O") && i.equals("O"))
        {
            Toast.makeText(MainActivity.this, "WINNER IS O", Toast.LENGTH_LONG).show();
            fin=true;
        }
        else if(a.equals("X") && d.equals("X") && g.equals("X"))
        {
            Toast.makeText(MainActivity.this, "WINNER IS X", Toast.LENGTH_LONG).show();
            fin=true;
        }
        else if(a.equals("O") && d.equals("O") && g.equals("O"))
        {
            Toast.makeText(MainActivity.this, "WINNER IS O", Toast.LENGTH_LONG).show();
            fin=true;
        }
        else if(b.equals("X") && d.equals("X") && g.equals("X"))
        {
            Toast.makeText(MainActivity.this, "WINNER IS X", Toast.LENGTH_LONG).show();
            fin=true;
        }
        else if(b.equals("O") && d.equals("O") && g.equals("O"))
        {
            Toast.makeText(MainActivity.this, "WINNER IS O", Toast.LENGTH_LONG).show();
            fin=true;
        }
        else if(c.equals("X") && f.equals("X") && i.equals("X"))
        {
            Toast.makeText(MainActivity.this, "WINNER IS X", Toast.LENGTH_LONG).show();
            fin=true;
        }
        else if(c.equals("O") && f.equals("O") && i.equals("O"))
        {
            Toast.makeText(MainActivity.this, "WINNER IS O", Toast.LENGTH_LONG).show();
            fin=true;
        }
        else if(d.equals("X") && e.equals("X") && f.equals("X"))
        {
            Toast.makeText(MainActivity.this, "WINNER IS X", Toast.LENGTH_LONG).show();
            fin=true;
        }
        else if(d.equals("O") && e.equals("O") && f.equals("O"))
        {
            Toast.makeText(MainActivity.this, "WINNER IS O", Toast.LENGTH_LONG).show();
            fin=true;
        }
        else if(g.equals("X") && h.equals("X") && i.equals("X"))
        {
            Toast.makeText(MainActivity.this, "WINNER IS X", Toast.LENGTH_LONG).show();
            fin=true;
        }
        else if(g.equals("O") && h.equals("O") && i.equals("O"))
        {
            Toast.makeText(MainActivity.this, "WINNER IS O", Toast.LENGTH_LONG).show();
            fin=true;
        }
        else if(c.equals("X") && e.equals("X") && g.equals("X"))
        {
            Toast.makeText(MainActivity.this, "WINNER IS X", Toast.LENGTH_LONG).show();
            fin=true;
        }
        else if(c.equals("O") && e.equals("O") && g.equals("O"))
        {
            Toast.makeText(MainActivity.this, "WINNER IS O", Toast.LENGTH_LONG).show();
            fin=true;
        }
        if (fin)
        {

            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            Toast.makeText(MainActivity.this, "Thank you !!", Toast.LENGTH_LONG).show();
        }






    }
    public void showNotification()
    {

    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
