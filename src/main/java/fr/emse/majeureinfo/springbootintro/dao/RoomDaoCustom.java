package fr.emse.majeureinfo.springbootintro.dao;


import fr.emse.majeureinfo.springbootintro.model.Room;

import java.util.List;

public interface RoomDaoCustom {

    public List<Room> findRoomsWithLightsOn();

}