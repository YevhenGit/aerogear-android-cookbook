package org.jboss.aerogear.cookbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import org.jboss.aerogear.cookbook.authentication.HowToUseAuthentication;
import org.jboss.aerogear.cookbook.authentication.HowToUseHttpBasicAuthentication;
import org.jboss.aerogear.cookbook.datamanager.HowToUseMemoryStorage;
import org.jboss.aerogear.cookbook.pipeline.HowToUseCustomPipe;
import org.jboss.aerogear.cookbook.pipeline.HowToUsePipeWithPagination;

public class Main extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button customPipe = (Button) findViewById(R.id.customPipe);
        customPipe.setOnClickListener(this);

        Button paginationPipe = (Button) findViewById(R.id.paginationPipe);
        paginationPipe.setOnClickListener(this);

        Button memoryStorage = (Button) findViewById(R.id.memoryStorage);
        memoryStorage.setOnClickListener(this);

        Button authentication = (Button) findViewById(R.id.authetication);
        authentication.setOnClickListener(this);

        Button httpBasicAuthentication = (Button) findViewById(R.id.httpBasicAuthetication);
        httpBasicAuthentication.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Class display = null;

        switch (view.getId()) {
            case R.id.customPipe:
                display = HowToUseCustomPipe.class;
                break;
            case R.id.paginationPipe:
                display = HowToUsePipeWithPagination.class;
                break;
            case R.id.memoryStorage:
                display = HowToUseMemoryStorage.class;
                break;
            case R.id.authetication:
                display = HowToUseAuthentication.class;
                break;
            case R.id.httpBasicAuthetication:
                display = HowToUseHttpBasicAuthentication.class;
                break;
        }

        startActivity(new Intent(this, display));
    }
}
