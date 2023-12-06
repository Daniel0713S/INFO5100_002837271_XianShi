package book.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class jsonParse {
    public static void main(String[] args) {

        try {
            // Read JSON file content
            String doc = new String(Files.readAllBytes(Paths.get("book.json")));

            //print JSON
            System.out.println("Original book library");
            Parser(doc);

            // Add a new book
            System.out.println("\nAfter Adding a new book:");
            doc = addBookToJson(doc, "Harry Potter and the Goblet of Fire", "2000", "636", "J. K. Rowling");
            // Print after adding a new book
            Parser(doc);

        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }

    //Parser
    private static void Parser(String doc) throws JSONException {
        JSONObject jsonObject = new JSONObject(doc);
        System.out.println(jsonObject.toString(4));
    }

    //Method for adding new book
    private static String addBookToJson(String nBook, String title, String publishedYear, String numberOfPages, String author) throws JSONException {
        JSONObject jsonObject = new JSONObject(nBook);
        JSONArray bookArray = jsonObject.getJSONObject("Library").getJSONArray("Book");

        // Create a new JSON object for the new book
        JSONObject newBook = new JSONObject()
                .put("title", title)
                .put("publishedYear", Integer.parseInt(publishedYear))
                .put("numberOfPages", Integer.parseInt(numberOfPages))
                .put("authors", new JSONArray().put(author));

        // Add the new book to the existing array
        bookArray.put(newBook);

        return jsonObject.toString(4);
    }

}
