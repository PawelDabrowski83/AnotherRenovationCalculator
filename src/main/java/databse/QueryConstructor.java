package databse;

import logic.Room;

public class QueryConstructor {
	
	public  String insertRoomToDatabase(Room roomDataToDatabse) {
			
			return "INSERT INTO `rooms` (`room_name`, `wallA`, `wallB`, `high`, `area_Walls`, `area_Ceiling`, `total_Area`, `circumference`)" +
			"VALUES ('"+ roomDataToDatabse.getName() + "',"
			+ " '"+roomDataToDatabse.getWallA()+"', '"
				  + roomDataToDatabse.getWallB()+"', '"
				  + roomDataToDatabse.getHigh()+"', '"
				  + roomDataToDatabse.areaWalls()+"', '"
				  + roomDataToDatabse.areaCeiling()+"', '"
				  + roomDataToDatabse.totalArea()+"', '"
				  + roomDataToDatabse.circumferenceOfRoom()+"')";
			
		}

}
