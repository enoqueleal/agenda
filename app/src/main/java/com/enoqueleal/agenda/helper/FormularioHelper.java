package com.enoqueleal.agenda.helper;


import android.widget.EditText;

import com.enoqueleal.agenda.R;
import com.enoqueleal.agenda.activity.FormularioActivity;
import com.enoqueleal.agenda.model.Aluno;

/**
 * Created by enoque.santos on 27/10/2016.
 */

public class FormularioHelper {

    private Aluno aluno;
    private EditText campoNome;
    private EditText campoSobrenome;

    public FormularioHelper(FormularioActivity activity){
        campoNome =      (EditText) activity.findViewById(R.id.formulario_nome);
        campoSobrenome = (EditText) activity.findViewById(R.id.formulario_sobrenome);
        aluno = new Aluno();
    }

    public Aluno pegaAluno() {
        aluno.setNome(campoNome.getText().toString());
        aluno.setSobrenome(campoSobrenome.getText().toString());
        return aluno;
    }

    public void preencheFormulario(Aluno aluno)  {
        campoNome.setText(aluno.getNome());
        campoSobrenome.setText(aluno.getSobrenome());
        this.aluno = aluno;
    }
}
