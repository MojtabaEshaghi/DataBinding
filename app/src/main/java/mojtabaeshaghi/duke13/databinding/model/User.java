package mojtabaeshaghi.duke13.databinding.model;


import androidx.databinding.ObservableField;

public class User {
    public static ObservableField<String> name = new ObservableField<>();
    public static ObservableField<String> email = new ObservableField<>();


    public static ObservableField<String> getName() {
        return name;
    }

    public static ObservableField<String> getEmail() {
        return email;
    }
}
