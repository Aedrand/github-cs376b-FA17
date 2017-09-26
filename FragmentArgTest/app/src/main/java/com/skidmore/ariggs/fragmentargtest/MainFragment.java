package com.skidmore.ariggs.fragmentargtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class MainFragment extends Fragment {

    private Course course;
    private EditText nameTxt;
    private EditText deptTxt;
    private Button button;

    public MainFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        course = new Course();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        nameTxt = (EditText) view.findViewById(R.id.main_frag_name);
        deptTxt = (EditText) view.findViewById(R.id.main_frag_dept);
        button = (Button) view.findViewById(R.id.main_frag_btn);

        course.setName(nameTxt.getText().toString());
        course.setDepartment(deptTxt.getText().toString());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                startActivity(intent);
            }
        });



        return view;
    }

}