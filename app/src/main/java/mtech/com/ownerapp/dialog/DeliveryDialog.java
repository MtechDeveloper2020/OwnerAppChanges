package mtech.com.ownerapp.dialog;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import mtech.com.ownerapp.R;

public class DeliveryDialog  extends DialogFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.delivery_dialog,container,false);
        Button oncebtn = (Button) view.findViewById(R.id.oncebtn);
        oncebtn.setOnClickListener(doneAction);
        Button freq = (Button) view.findViewById(R.id.freqbtn);
        freq.setOnClickListener(freqAction);

        return view;
    }

    View.OnClickListener doneAction = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Toast.makeText(getActivity(),"Test",Toast.LENGTH_LONG).show();
        }
    };

    View.OnClickListener freqAction = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Toast.makeText(getActivity(),"freqAction !",Toast.LENGTH_LONG).show();
        }
    };

}

