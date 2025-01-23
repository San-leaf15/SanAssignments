package homeassignwk3;

public class APIClientOverload
{
	public void sendRequest(String endpoint)
	{
		System.out.println("Same methodname - One parameter - overload");
		System.out.println(endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus)
	{
		System.out.println("Same methodname - Multiple parameter - overload");
		System.out.println(endpoint+requestBody+requestStatus);
	}
	
	public static void main(String[] args)
	{
		APIClientOverload api = new APIClientOverload();
		api.sendRequest("api");
		api.sendRequest("api2", "content", true);
	}

}
