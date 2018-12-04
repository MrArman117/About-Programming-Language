package com.example.itsarman.programminglanguagedetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ExpandableListView expandableListView;
    private List<String> title = new ArrayList<>();
    private Map<String, List<String>> child = new HashMap<>();
    private List<Integer> images = new ArrayList<>();

    int lastposition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        preparedData();
        addListener();
    }

    private void addListener() {

        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int i) {

                if (lastposition != -1 && lastposition != i) {
                    expandableListView.collapseGroup(lastposition);
                }

                lastposition = i;
            }
        });


        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {


                String children = child.get(title.get(i)).get(i1);

                Toast.makeText(MainActivity.this, "" + children, Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }

    private void preparedData() {

        title.add("Java Language");
        title.add("C Programming");
        title.add("C++ Programming");
        title.add("Python Language");
        title.add("C# Language");
        title.add("JavaScript");
        title.add("VB.NET");
        title.add("R Language");
        title.add("PHP Language");
        title.add("MATLAB");
        title.add("Swift");


        images.add(R.drawable.java_logo);
        images.add(R.drawable.c_logo);
        images.add(R.drawable.cpp_logo);
        images.add(R.drawable.php_logo);
        images.add(R.drawable.c_sharpe_logo);
        images.add(R.drawable.java_script_logo);
        images.add(R.drawable.vb_logo);
        images.add(R.drawable.r_logo);
        images.add(R.drawable.php_logo);
        images.add(R.drawable.mathlab_logo);
        images.add(R.drawable.swift_logo);


        List<String> java = new ArrayList<>();
        java.add("Java Language is Launched by Sun Microsystem in 1995");
        java.add("Java is Fast, Dependable and Secure" +
                "Simple :\n" +
                "Java is Easy to write and more readable and eye catching.\n" +
                "Java has a concise, cohesive set of features that makes it easy to learn and use.\n" +
                "Most of the concepts are drew from C++ thus making Java learning simpler.\n" +
                "\n" +
                "Secure :\n" +
                "Java program cannot harm other system thus making it secure.\n" +
                "Java provides a secure means of creating Internet applications.\n");

        child.put(title.get(0), java);


        List<String> c_program = new ArrayList<>();
        c_program.add("C is one of the most popular programming language in the world. " +
                "It is used in many purpose now a days because of its qualities’ " +
                "resembles general English language.Therefore,the complex programs can be " +
                "written in this language in a simplex easier way.");
        c_program.add("C Language. C is a structured programming language \\n developed by Dennis Ritchie in 1973 at Bell Laboratories.");
        child.put(title.get(1), c_program);

        List<String> cpp = new ArrayList<>();
        cpp.add("C++ is an Object Oriented Programming Language (OOPL).\n" +
                "  C++ have huge Function Library.\n" +
                "  C++ is highly Flexible language with Versatility.\n" +
                "  C++ can be used for developing System Software viz., operating systems, compilers,...\n" +
                "  C++ is suitable for Development of Reusable Software. , thus reduces cost of software development.\n");
        child.put(title.get(2), cpp);


        List<String> phython = new ArrayList<>();
        phython.add("Python is an entirely object oriented programming language," +
                " which means that all the variable types are objects. " +
                "There are no primitive types such as integers found in Java or C. " +
                "In addition, python contains more complex built-in types " +
                "such as lists and dictionaries," +
                " which are not found in other languages. ");

        child.put(title.get(3), phython);


        List<String> c_sharp = new ArrayList<>();
        c_sharp.add("1. SIMPLE \n" +
                " 1.Pointers are missing in C#. \n" +
                "2.Unsafe operations such as direct memory manipulation are not allowed. \n" +
                "3.In C# there is  no usage of \"::\" or \"->\" operators. \n" +
                "4.Since it's on .NET, it inherits the features of automatic memory management and garbage collection. \n" +
                "5.Varying ranges of the primitive types like Integer,Floats etc. \n" +
                "6.Integer values  of 0 and 1 are no longer accepted as boolean values.Boolean values are pure true or false values in C# so no more errors of \"=\"operator and \"==\"operator. \n" +
                "7.\"==\" is used for comparison operation and \"=\" is used for assignment operation.\n");
        child.put(title.get(4), c_sharp);


        List<String> javaScript = new ArrayList<>();
        javaScript.add("JavaScript was developed as Netscape’s cross-platform scripting language and is based on an object model that allows you to control user interaction with HTML pages. \n" +
                "\n" +
                "JavaScripts consist of special commands embedded in an HTML document (which increases the size and complexity of the HTML document).\n" +
                " JavaScripts execute when a browser loads a page and interprets the HTML code in which they are embedded.\n" +
                "\n" +
                "There are two types of JavaScript: \n" +
                "1.Server-side JavaScript, such as LiveWire JavaScript. \n" +
                "2.Client-side JavaScript, such as Navigator JavaScript.\n" +
                "\n" +
                "JavaScript programming is simple compared to Pascal, Perl, Java, C, and C++. (Java does not support pointers and memory allocation programming, which are complex components of C and \n");
        javaScript.add("Generally color is gray,white ");
        child.put(title.get(5), javaScript);


        List<String> VBlanguage = new ArrayList<>();
        VBlanguage.add("The vocabulary and syntax of VB are derived from BASIC; however, VB differs significantly from BASIC in several respects:\n" +
                " VB provides a set of visual objects (recognized as controls) that can be drawn easily onto a window (called a form). " +
                "These controls eliminate the need to develop the code to construct the visual interface. The layout of the windows" +
                " that contain the controls can be changed easily by dragging and dropping the controls to a new location, without " +
                "necessitating a change in the code. The process for program development " +
                "and revision becomes much easier and requires much less time and effort ");
        VBlanguage.add("Generally color is gray,white ");
        child.put(title.get(6), VBlanguage);


        List<String> rlanguage = new ArrayList<>();
        rlanguage.add("It Foundeed by John Chambers and colleagues");
        rlanguage.add("R can be considered as a different implementation of S.");
        child.put(title.get(7), rlanguage);

        List<String> php = new ArrayList<>();
        php.add("PHP is a server-side scripting language ");
        php.add("R can be considered as a different implementation of S.");
        child.put(title.get(8), php);

        List<String> mathlab = new ArrayList<>();
        mathlab.add("Matlab is a language and package as well. ");
        mathlab.add(" The language used in Matlab tool is Matlab.");
        child.put(title.get(9), mathlab);

        List<String> swift = new ArrayList<>();
        swift.add("Swift is designed to work with Apple's Cocoa and Cocoa Touch frameworks ");
        swift.add("Its developed by Apple Inc. for iOS, macOS, watchOS, tvOS, and Linux. ");
        child.put(title.get(10), swift);



        ProgrammingAdapter adapter = new ProgrammingAdapter(this,title,child, images);

        expandableListView.setAdapter(adapter);

    }

    private void initView() {
    expandableListView = findViewById(R.id.languageId);
    }
}
