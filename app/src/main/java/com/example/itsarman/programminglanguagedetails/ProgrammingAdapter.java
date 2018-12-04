package com.example.itsarman.programminglanguagedetails;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

public class ProgrammingAdapter extends BaseExpandableListAdapter {

    private Context context;
    List<String> title;
    List<Integer> images;
    Map<String, List<String>> child;

    public ProgrammingAdapter(Context context, List<String> title, Map<String, List<String>> child, List<Integer> images ) {
        this.context = context;
        this.title = title;
        this.child = child;

        this.images = images;

    }


    @Override
    public int getGroupCount() {
        return title.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return child.get(title.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return title.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return child.get(title.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_language, null);
        }

        TextView textView = convertView.findViewById(R.id.language_title);
        ImageView imageView = convertView.findViewById(R.id.arrowImgId);
        ImageView imageView2 = convertView.findViewById(R.id.logoId);

        textView.setText(title.get(groupPosition));
        imageView2.setImageResource(images.get(groupPosition));

        if (isExpanded) {
            imageView.setImageResource(R.drawable.arrow_right);
        }
        else {
            imageView.setImageResource(R.drawable.arrow_below);
        }


        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.details_language, null);
        }

        TextView textView = convertView.findViewById(R.id.details_language_title);
        textView.setText(child.get(title.get(groupPosition)).get(childPosition));


        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
