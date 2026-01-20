 package week3.day2.assignments;

 public class APIClient {
    public void sendRequest(String endpoint) {
        System.out.println("Sending request to endpoint: " + endpoint);
    }

    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Request Body: " + requestBody);
        
        if (requestStatus) {
            System.out.println("Request Status: Request was successful.");
        } else {
            System.out.println("Request Status: Request failed.");
        }
    }

    public static void main(String[] args) {

        APIClient api = new APIClient();
        api.sendRequest("https://api.example.com/users");

        System.out.println("--------------------------------");
        api.sendRequest(
            "https://api.example.com/createUser",
            "{ \"name\": \"John\", \"role\": \"admin\" }",
            true
        );
    }
}

