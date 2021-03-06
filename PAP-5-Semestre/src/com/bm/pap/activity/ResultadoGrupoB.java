package com.bm.pap.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.bm.pap.R;

public class ResultadoGrupoB extends Activity {
	private Spinner spinner1;
	private Spinner spinner2;
	private Spinner spinner3;
	private Spinner spinner4;
	private Spinner spinner5;
	private Spinner spinner6;
	private Spinner spinner7;
	private Spinner spinner8;
	private Spinner spinner9;
	private Spinner spinner10;	
	private Spinner spinner11;
	private Spinner spinner12;
	ArrayAdapter<CharSequence> adapter;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_resultado_grupo_b);

		// espanha vs uruguai
		adapter = ArrayAdapter.createFromResource(this, R.array.Gols,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// resultado espanha
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner1.setAdapter(adapter);
		spinner1.setSelection(adapter.getPosition("2"));

		// resultado uruguai
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		spinner2.setAdapter(adapter);
		;
		spinner2.setSelection(adapter.getPosition("1"));

		// taiti vs nig�ria
		// resultado taiti
		spinner3 = (Spinner) findViewById(R.id.spinner3);
		spinner3.setAdapter(adapter);
		spinner3.setSelection(adapter.getPosition("1"));

		// resultado nig�ria
		spinner4 = (Spinner) findViewById(R.id.spinner4);
		spinner4.setAdapter(adapter);
		spinner4.setSelection(adapter.getPosition("6"));

		// espanha vs taiti

		// resultado espanha
		spinner5 = (Spinner) findViewById(R.id.spinner5);
		spinner5.setAdapter(adapter);
		spinner5.setSelection(adapter.getPosition("10"));

		// resultado taiti
		spinner6 = (Spinner) findViewById(R.id.spinner6);
		spinner6.setAdapter(adapter);
		spinner6.setSelection(adapter.getPosition("0"));

		// nig�ria vs uruguai
		// resultado nigeria
		spinner7 = (Spinner) findViewById(R.id.spinner7);
		spinner7.setAdapter(adapter);
		spinner7.setSelection(adapter.getPosition("1"));

		// resultado uruguai
		spinner8 = (Spinner) findViewById(R.id.spinner8);
		spinner8.setAdapter(adapter);
		spinner8.setSelection(adapter.getPosition("2"));

		// nig�ria vs espanha
		// resultado nig�ria
		spinner9 = (Spinner) findViewById(R.id.spinner9);
		spinner9.setAdapter(adapter);
		spinner9.setSelection(adapter.getPosition("0"));

		// resultado espanha
		spinner10 = (Spinner) findViewById(R.id.spinner10);
		spinner10.setAdapter(adapter);
		spinner10.setSelection(adapter.getPosition("3"));

		// uruguai vs taiti
		// resultado uruguai
		spinner11 = (Spinner) findViewById(R.id.spinner11);
		spinner11.setAdapter(adapter);
		spinner11.setSelection(adapter.getPosition("8"));

		// resultado taiti
		spinner12 = (Spinner) findViewById(R.id.spinner12);
		spinner12.setAdapter(adapter);
		spinner12.setSelection(adapter.getPosition("0"));
	}
}
