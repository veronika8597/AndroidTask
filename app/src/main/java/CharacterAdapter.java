import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.squareup.picasso.Picasso;
import java.util.List;

import ObjectModel.CharacterDetails;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.ViewHolder> {

    private final List<CharacterDetails> characters;

    // Corrected constructor name and parameter
    public CharacterAdapter(List<CharacterDetails> characters) {
        this.characters = characters; // Corrected to use the parameter properly
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.character_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CharacterDetails characterDetails = characters.get(position);
        holder.characterName.setText(characterDetails.getName());
        // Ensure the thumbnail URL is correct and accessible by Picasso
        Picasso.get().load(characterDetails.getThumbnail()).into(holder.characterImage);
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView characterName;
        public ImageView characterImage;

        public ViewHolder(View itemView) {
            super(itemView);
            characterName = itemView.findViewById(R.id.NameTextView);
            characterImage = itemView.findViewById(R.id.CharacterImageView);
        }
    }
}
