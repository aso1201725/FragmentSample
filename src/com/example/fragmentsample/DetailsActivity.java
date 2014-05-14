package com.example.fragmentsample;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;


public class DetailsActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedIndtanceState){
		super.onCreate(savedInstanceState);

		FrameLayout layout=new FrameLayout(this);
		layout.setId(R.id.details);
		setContentView(layout);

		String cont="";
		Bundle extras=GetIntent().getE.tras();
			cont=extras.getString("contents");

		DetailsFragment fragmet=DetailsFragment
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
