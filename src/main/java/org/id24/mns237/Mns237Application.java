package org.id24.mns237;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;

import com.google.firebase.*;
//import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.auth.oauth2.GoogleCredentials;

@SpringBootApplication
public class Mns237Application {

  public static void main(String[] args) throws IOException{
    ClassLoader classLoader = Mns237Application.class.getClassLoader();
    File file = new File(Objects.requireNonNull(classLoader.getResource("serviceAccountKey.json")).getFile());
   // FileInputStream serviceAccount = new FileInputStream(file.getAbsolutePath());
    FileInputStream serviceAccount = new FileInputStream("serviceAccountKey.json");

FirebaseOptions options = new FirebaseOptions.Builder()
  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
  .setDatabaseUrl("https://mns237-d3d84-default-rtdb.firebaseio.com")
  .build();

FirebaseApp.initializeApp(options);

    SpringApplication.run(Mns237Application.class, args);
  }

}

