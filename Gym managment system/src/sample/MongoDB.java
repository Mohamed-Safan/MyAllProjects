package sample;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Scanner;

public class MongoDB {
    public String savingname ="List of the Member";
    MongoClient mongoClient = (MongoClient) MongoClients.create();
    Scanner sv = new Scanner(System.in);
    MongoDatabase database=mongoClient.getDatabase(("GYM Management"));
    MongoCollection<Document>collection=database.getCollection(savingname);
    Gson gson = new Gson();

    public ArrayList<DefaultMember> loadHashMap() {
        ArrayList<DefaultMember> members = new ArrayList<>();
        if (collection.countDocuments() <=0) {
            System.out.println("Collection Emplty, Cannot Load");
        }
        else {
            MongoCursor<Document> cursor = collection.find().iterator();
            try {
                while (cursor.hasNext()) {
                    //members.add(gson.fromJson(cursor.next().toJson(), DefaultMember.class));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            finally {
                cursor.close();
            }
        }

        return members;
    }

}



