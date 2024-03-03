package com.example.terrafund;// DeclarationsActivity.java
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DeclarationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_declarations);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    return true;
            }
            return false;
        });
    }

    private void navigateToHome() {

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new HOME())
                .commit();
    }
}

