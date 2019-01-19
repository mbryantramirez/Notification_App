package com.example.rzmorales.notification_app_hw_zaratemorales_robert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String USER_KEY = "this key";
    public static final String ANTEATER = "Baby Anteater";
    public static final String BUNNY = "Baby Bunny";
    public static final String CHINCHILLA = "Baby Chincilla";
    public static final String FISH = "Baby Fish";
    public static final String FOAL = "Baby Foal";
    public static final String FOX = "Baby Fox";
    public static final String FOXES = "Baby Foxes";
    public static final String HAMSTER = "Baby Hamster";
    public static final String LAMB = "Baby Lamb";
    public static final String OCTOPUS = "Baby Octopus";
    public static final String OTTER = "Baby Otter";
    public static final String OWL = "Baby Owl";
    public static final String PANDA = "Baby Panda";
    public static final String PENGUINS = "Baby Penguins";
    public static final String PIGLET = "Baby Piglet";
    public static final String PRARIEDOGS = "Baby Prarie Dogs";
    public static final String SEAL = "Baby Seal";
    public static final String SKUNK = "Baby Skunk";
    public static final String SLOTH = "Baby Sloth";
    public static final String WALRUS = "Baby Walrus";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = findViewById(R.id.RecyclerID);

        List<ModelClass> modelClassList = new ArrayList<>();
        modelClassList.add(new ModelClass(R.drawable.baby_anteater,ANTEATER));
        modelClassList.add(new ModelClass(R.drawable.baby_bunny,BUNNY));
        modelClassList.add(new ModelClass(R.drawable.baby_chinchilla,CHINCHILLA));
        modelClassList.add(new ModelClass(R.drawable.baby_fish,FISH));
        modelClassList.add(new ModelClass(R.drawable.baby_foal,FOAL));
        modelClassList.add(new ModelClass(R.drawable.baby_fox,FOX));
        modelClassList.add(new ModelClass(R.drawable.baby_foxes,FOXES));
        modelClassList.add(new ModelClass(R.drawable.baby_hamster,HAMSTER));
        modelClassList.add(new ModelClass(R.drawable.baby_octopus,OCTOPUS));
        modelClassList.add(new ModelClass(R.drawable.baby_lamb,LAMB));
        modelClassList.add(new ModelClass(R.drawable.baby_otter,OTTER));
        modelClassList.add(new ModelClass(R.drawable.baby_panda,PANDA));
        modelClassList.add(new ModelClass(R.drawable.baby_penguins,PENGUINS));
        modelClassList.add(new ModelClass(R.drawable.baby_piglet,PIGLET));
        modelClassList.add(new ModelClass(R.drawable.baby_prairiedogs,PRARIEDOGS));
        modelClassList.add(new ModelClass(R.drawable.baby_seal,SEAL));
        modelClassList.add(new ModelClass(R.drawable.baby_skunk,SKUNK));
        modelClassList.add(new ModelClass(R.drawable.baby_sloth,SLOTH));
        modelClassList.add(new ModelClass(R.drawable.baby_walrus,WALRUS));
        modelClassList.add(new ModelClass(R.drawable.baby_owl,OWL));



        AdapterClass adapterClass = new AdapterClass(modelClassList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setAdapter(adapterClass);
        recyclerView.setLayoutManager(linearLayoutManager);

//        Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
//        //insert value here
//        intent.putExtra(USER_KEY,"");
//        startActivity(intent);


    }
}
