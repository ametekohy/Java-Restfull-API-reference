package com.ametekohy.app.resources;

import com.ametekohy.app.services.ItemService;
import com.ametekohy.app.services.dto.ItemDTO;

import javax.ejb.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/items")
 @Singleton
// TomEE maakt voor ieder request een nieuwe instantie, om addItem() te testen wordt hiervan een singeleton van gemaakt
public class ItemResource {
    private ItemService itemService;

    public ItemResource() {
        this.itemService = new ItemService();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getTextItems() {
        return "bread, butter";
    }

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public String getJSONItems() {
//        return "[\"bread\", \"butter\"]";
//    }

    // Voorbeeld voor het automatisch JSON genereren van Java-Objecten door JAX-RS
    // Spelregels hiervoor zijn dat de betreffende class moet voldoen aan de zgn. "bean specificatie"
    // (https://docstore.mik.ua/orelly/java-ent/jnut/ch06_02.htm)
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<ItemDTO> getJSONItems() {
//        return itemService.getAll();
//    }

    // De voorbeeld hierboven vult de inhoud van de header automatisch in.
    // Door een Response te retouneren kan je welke HTTP-status code de header moet bevatten
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJSONItems() {
        return Response
                .ok() //.status(200)
                .entity(itemService.getAll())
                .build();
    }

    // Een voorbeeld hoe er een item wordt toegevoegd met POST en een Response terug geeft.
    // Wanneer er een correcte JSON in de body van je request meestuurt, zal JAX-RS dit automatisch omzetten
    // naar een correct Java-Object dmv Consumers.
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addItem(ItemDTO dto) {
        itemService.addItem(dto);

        return Response
                .status(201)
                .build();
    }

    // Voorbeeld van een DELETE voor het verwijderen van een item
    // Dmv het id op te halen van de Path en als PathParam te gebruiken.
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteItem(@PathParam("id")int id) {
        itemService.deleteItem(id);

        return Response
                .ok() //.status(200)
                .build();
    }
}
