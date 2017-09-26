package com.skidmore.ariggs.fragmentargtest;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.health.UidHealthStats;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.UUID;

public class SecondFragment extends Fragment {
    public static final String ARG_COURSE_ID = "course_id";
    private Course course;
    private TextView nameTxt;
    private TextView deptTxt;

    public SecondFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UUID courseID = (UUID) getArguments().getSerializable(ARG_COURSE_ID);
        course = CourseList.get(getActivity()).getCourse(courseID);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        nameTxt = (TextView) view.findViewById(R.id.second_frag_name);

        nameTxt.setText(course.getName());

        return view;
    }

    public static SecondFragment newInstance(UUID courseID) {
        Bundle args = new Bundle();
        args.putSerializable(ARG_COURSE_ID, courseID);

        SecondFragment secondFragment = new SecondFragment();
        secondFragment.setArguments(args);
        return secondFragment;
    }
}
