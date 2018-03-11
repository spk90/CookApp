package com.example.user.cookapp.activities;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.user.cookingapp.R;

import java.util.ArrayList;
import java.util.List;

import com.example.user.cookapp.adapters.MainRecipeAdapter;
import de.hdodenhof.circleimageview.CircleImageView;
import com.example.user.cookapp.models.MainRecipe;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private MainRecipeAdapter mainRecipeAdapter;
    private List<MainRecipe> mainRecipes;
    private MainRecipe mainRecipe;
    private CircleImageView imageView;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(this);

        recyclerView        = (RecyclerView)findViewById(R.id.recycleViewMainActivity);
        imageView           = (CircleImageView)findViewById(R.id.thumbnail);

        mainRecipes         = new ArrayList<>();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        mainRecipeAdapter   = new MainRecipeAdapter(mainRecipes);
        mainRecipe          = new MainRecipe("PIZAA HOT", 10);
        mainRecipes.add(mainRecipe);
        mainRecipe          = new MainRecipe("PIZAA HOT", 10);
        mainRecipes.add(mainRecipe);
        mainRecipe          = new MainRecipe("PIZAA HOT", 10);
        mainRecipes.add(mainRecipe);
        mainRecipe          = new MainRecipe("PIZAA HOT", 10);
        mainRecipes.add(mainRecipe);
        mainRecipe          = new MainRecipe("PIZAA HOT", 10);
        mainRecipes.add(mainRecipe);
        mainRecipe          = new MainRecipe("PIZAA HOT", 10);
        mainRecipes.add(mainRecipe);
        mainRecipe          = new MainRecipe("PIZAA HOT", 10);
        mainRecipes.add(mainRecipe);
        mainRecipe          = new MainRecipe("PIZAA HOT", 10);
        mainRecipes.add(mainRecipe);
        mainRecipe          = new MainRecipe("PIZAA HOT", 10);
        mainRecipes.add(mainRecipe);
        mainRecipe          = new MainRecipe("PIZAA HOT", 10);
        mainRecipes.add(mainRecipe);
        mainRecipe          = new MainRecipe("PIZAA HOT", 10);
        mainRecipes.add(mainRecipe);
        mainRecipe          = new MainRecipe("PIZAA HOT", 10);
        mainRecipes.add(mainRecipe);
        mainRecipe          = new MainRecipe("PIZAA HOT", 10);
        mainRecipes.add(mainRecipe);
        mainRecipe          = new MainRecipe("PIZAA HOT", 10);
        mainRecipes.add(mainRecipe);
        mainRecipe          = new MainRecipe("PIZAA HOT", 10);
        mainRecipes.add(mainRecipe);
        mainRecipe          = new MainRecipe("PIZAA HOT", 10);
        mainRecipes.add(mainRecipe);
        recyclerView.setAdapter(mainRecipeAdapter);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}