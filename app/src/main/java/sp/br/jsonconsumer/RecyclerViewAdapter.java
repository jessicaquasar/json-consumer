package sp.br.jsonconsumer;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import sp.br.jsonconsumer.model.Person;

class RecyclerViewHolder extends RecyclerView.ViewHolder {

    public TextView txtId;
    public TextView txtName;
    public TextView txtPwd;

    public RecyclerViewHolder(View itemView) {

        super(itemView);
        txtId = itemView.findViewById(R.id.txtId);
        txtName = itemView.findViewById(R.id.txtName);
        txtPwd = itemView.findViewById(R.id.txtPwd);
    }
}

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<Person> dataList;

    public RecyclerViewAdapter() {
        this.dataList = new ArrayList<>();
    }

    public void setDataList(List<Person> persons) {
        this.dataList = persons;
        this.notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item, parent, false);

        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        holder.txtId.setText(dataList.get(position).getId());
        holder.txtName.setText(dataList.get(position).getName());
        holder.txtPwd.setText(dataList.get(position).getPwd());
    }

    @Override
    public int getItemCount() {

        return dataList.size();
    }
}
