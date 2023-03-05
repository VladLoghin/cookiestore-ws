package com.example.cookiestorews.Cookie.datamapperlayer;

import com.example.cookiestorews.Cookie.datalayer.Cookie;
import com.example.cookiestorews.Cookie.presentationlayer.CookieResponseModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CookieResponseMapper {
    /*@Mapping(expression = "java(Cookie.getCookieIdentifier().getCookieId())", target = "cookie_id")
    /*@Mapping(expression = "java(Cookie.getInventoryIdentifier().getInventoryId())", target = "inventory_id")
    */

            CookieResponseModel entityToResponseMapper(Cookie cookie);

    List<CookieResponseModel> entityToResponseModel(List<Cookie> cookie);


}
