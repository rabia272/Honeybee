package org.iiui.honeybee.ui.Profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import org.iiui.honeybee.EditEmail;
import org.iiui.honeybee.EditName;
import org.iiui.honeybee.EditPassword;
import org.iiui.honeybee.R;

public class ProfileFragment extends Fragment {

  CardView editName,cardViewEmail,cardViewPassword;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_profile, container, false);
        editName= root.findViewById(R.id.cardViewName);
        editName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent=new Intent(getContext(),EditName.class);
            startActivity(intent);
            }
        });

        cardViewEmail= root.findViewById(R.id.cardViewEmail);
        cardViewEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), EditEmail.class);
                startActivity(intent);
            }
        });

        cardViewPassword= root.findViewById(R.id.cardViewPassword);
        cardViewPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), EditPassword.class);
                startActivity(intent);
            }
        });

        return root;
    }
}