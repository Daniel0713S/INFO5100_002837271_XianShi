package book.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class xmlParse{
    public static void main(String[] args) {
        //Parser
        try {
            File inputFile = new File("book.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("Book");
            System.out.println("----------------------------");

            //Print sources from tutorialspoint
            //Original xml
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nPrevious Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    System.out.println("title : "
                            + eElement
                            .getElementsByTagName("title")
                            .item(0)
                            .getTextContent());
                    System.out.println("publishedYear : "
                            + eElement
                            .getElementsByTagName("publishedYear")
                            .item(0)
                            .getTextContent());
                    System.out.println("numberOfPages : "
                            + eElement
                            .getElementsByTagName("numberOfPages")
                            .item(0)
                            .getTextContent());
                    System.out.println("authors : "
                            + eElement
                            .getElementsByTagName("author")
                            .item(0)
                            .getTextContent());

                }
            }

            // Add book to xml
            addBookToXml(doc, "Harry Potter and the Goblet of Fire", "2000", "636", "J. K. Rowling");


            //print current library
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    System.out.println("title : "
                            + eElement
                            .getElementsByTagName("title")
                            .item(0)
                            .getTextContent());
                    System.out.println("publishedYear : "
                            + eElement
                            .getElementsByTagName("publishedYear")
                            .item(0)
                            .getTextContent());
                    System.out.println("numberOfPages : "
                            + eElement
                            .getElementsByTagName("numberOfPages")
                            .item(0)
                            .getTextContent());
                    System.out.println("authors : "
                            + eElement
                            .getElementsByTagName("author")
                            .item(0)
                            .getTextContent());

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


        //method for adding book to xml
        private static void addBookToXml(Document document, String title, String publishedYear, String numberOfPages, String author) {
            Element Library = document.getDocumentElement();

            // Create new Book element
            Element newBook = document.createElement("Book");

            // Create title element and set text content
            Element titleElement = document.createElement("title");
            titleElement.setTextContent(title);

            // Create publishedYear element and set text content
            Element publishedYearElement = document.createElement("publishedYear");
            publishedYearElement.setTextContent(publishedYear);

            // Create numberOfPages element and set text content
            Element numberOfPagesElement = document.createElement("numberOfPages");
            numberOfPagesElement.setTextContent(numberOfPages);

            // Create authors element
            Element authorsElement = document.createElement("authors");
            Element authorElement = document.createElement("author");
            authorElement.setTextContent(author);
            authorsElement.appendChild(authorElement);

            // Append elements to the new Book
            newBook.appendChild(titleElement);
            newBook.appendChild(publishedYearElement);
            newBook.appendChild(numberOfPagesElement);
            newBook.appendChild(authorsElement);

            // Append the new Book to the BookShelf
            Library.appendChild(newBook);
        }



}
