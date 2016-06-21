package com.example.android.sunshine.app;

import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment1())
                    .commit();
        }
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new PlaceholderFragment2())
                        .commit();
                break;
            case R.id.button2:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new PlaceholderFragment3())
                        .commit();
                break;
            case R.id.button3:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new PlaceholderFragment4())
                        .commit();
                break;
            case R.id.button4:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new PlaceholderFragment5())
                        .commit();
                break;
            case R.id.button5:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new PlaceholderFragment6())
                        .commit();
                break;
            case R.id.button8:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new PlaceholderFragment1())
                        .commit();
                break;
            case R.id.button:
            case R.id.button10:
            case R.id.button11:

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new PlaceholderFragment7())
                        .commit();
                break;

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

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment1 extends Fragment {

        public PlaceholderFragment1() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }

    }

    public static class PlaceholderFragment2 extends Fragment {

        public PlaceholderFragment2() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            String[] data = {
                    "Lecture 1:  Introduction",
                    "Lecture 2:  Properties, units & dimensions; hard-sphere MD",
                    "Lecture 3:  Periodic boundaries, simulation structure, confidence limits, initialization",
                    "Lecture 4:  Object oriented programming, API",
                    "Lecture 5:  Study of some the Java source code",
                    "Lecture 6:  Statistical mechanics" ,
                    "Lecture 7:  Monte Carlo integration",
                    "Lecture 8:  Markov processes" ,
                    "Lecture 9:  Monte Carlo simulation" ,
                    "Lecture 10: Simple biasing techniques",
                    "Lecture 11: Introduction to molecular dynamics",
                    "Lecture 12: Measurement of transport coefficients; time correlation functions",
                    "Lecture 13: Molecular dynamics at constant temperature and pressure",
                    "Lecture 14: Molecular modeling",
                    "Lecture 15: Long-range interactions and Ewald sum",
                    "Lecture 16: Dielectrics",
                    "Lecture 17: Beyond atoms:  Simulating molecules",
                    "Lecture 18: Free-energy calculations",
                    "Lecture 19: Distribution methods.  Accuracy and precision of FEP calculations",
                    "Lecture 20: Phase equilibria calculations",
                    "Lecture 21: Histogram reweighting method",
                    "Lecture 22: Configurational bias and methods for chain molecules",
                    "Lecture 23: Symmetry in MD integrators. RESPA.",
                    "Lecture 25: Efficiencies, algorithms for parallel computing platforms"

            };

            List<String> lectures = new ArrayList<String>(Arrays.asList(data));
            // Now that we have some dummy forecast data, create an ArrayAdapter.
            // The ArrayAdapter will take data from a source (like our dummy forecast) and
            // use it to populate the ListView it's attached to.
            ArrayAdapter<String> lecturesAdapter;

            lecturesAdapter = new ArrayAdapter<String>(
                    getActivity(), // The current context (this activity)
                    R.layout.lecture_data, // The name of the layout ID.
                    R.id.textview, // The ID of the textview to populate.
                    lectures);
            View rootView = inflater.inflate(R.layout.fragment_lectures, container, false);

            // Get a reference to the ListView, and attach this adapter to it.
            ListView listView = (ListView) rootView.findViewById(R.id.listView);
            listView.setAdapter(lecturesAdapter);
            return rootView;
        }

    }

    public static class PlaceholderFragment3 extends Fragment {

        public PlaceholderFragment3() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            String[] data = {

                            "Properties, units, dimensions, scaling",
                            "Hard-sphere molecular dynamics",
                            "Error analysis",
                            "Object-oriented programming and the molecular simulation API",
                            "A survey of statistical mechanics as it pertains to molecular simulation",
                            "Monte Carlo integration and importance sampling (access via the web text as described below)",
                            "Markov processes",
                            "Monte Carlo simulation",
                            "Simple biasing methods",
                            "Basic molecular dynamics simulation",
                            "Measuring dynamical properties (not yet prepared)",
                            "Isothermal/isobaric MD (not yet prepared)",
                            "Long-range forces and the Ewald sum",
                            "Dielectrics (not yet prepared)",
                            "Simulating molecules (not yet prepared)",
                            "Free energy calculations (not yet prepared)"

            };

            List<String> lectures = new ArrayList<String>(Arrays.asList(data));
            // Now that we have some dummy forecast data, create an ArrayAdapter.
            // The ArrayAdapter will take data from a source (like our dummy forecast) and
            // use it to populate the ListView it's attached to.
            ArrayAdapter<String> lecturesAdapter;

            lecturesAdapter = new ArrayAdapter<String>(
                    getActivity(), // The current context (this activity)
                    R.layout.lecture_data, // The name of the layout ID.
                    R.id.textview, // The ID of the textview to populate.
                    lectures);
            View rootView = inflater.inflate(R.layout.fragment_lectures, container, false);

            // Get a reference to the ListView, and attach this adapter to it.
            ListView listView = (ListView) rootView.findViewById(R.id.listView);
            listView.setAdapter(lecturesAdapter);
            return rootView;
        }

    }
    public static class PlaceholderFragment4 extends Fragment {

        public PlaceholderFragment4() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_assignment, container, false);
            return rootView;
        }

    }

    public static class PlaceholderFragment5 extends Fragment {

        public PlaceholderFragment5() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragmentapplets, container, false);
            return rootView;
        }

    }

    public static class PlaceholderFragment6 extends Fragment {

        public PlaceholderFragment6() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.course_info, container, false);
            return rootView;
        }

    }

    public static class PlaceholderFragment7 extends Fragment {

        public PlaceholderFragment7() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            String[] data = {

                    "Assignment 1",
                    "Assignment 2",
                    "Assignment 3",
                    "Assignment 4",
                    "Assignment 5",
                    "Assignment 6",
                    "Assignment 7",
                    "Assignment 8",
                    "Assignment 9",
                    "Assignment 10"
            };

            List<String> lectures = new ArrayList<String>(Arrays.asList(data));
            // Now that we have some dummy forecast data, create an ArrayAdapter.
            // The ArrayAdapter will take data from a source (like our dummy forecast) and
            // use it to populate the ListView it's attached to.
            ArrayAdapter<String> lecturesAdapter;

            lecturesAdapter = new ArrayAdapter<String>(
                    getActivity(), // The current context (this activity)
                    R.layout.lecture_data, // The name of the layout ID.
                    R.id.textview, // The ID of the textview to populate.
                    lectures);
            View rootView = inflater.inflate(R.layout.fragment_lectures, container, false);

            // Get a reference to the ListView, and attach this adapter to it.
            ListView listView = (ListView) rootView.findViewById(R.id.listView);
            listView.setAdapter(lecturesAdapter);
            return rootView;
        }

    }

}
