# baseless 
A baseless database application.

This is actually a try from my side to create a Object Oriented NO-SQL Database, which stores data of a object in JSON format.<br>

### Q1. Why I decided to create this Database ?
**Answer >** I had 4 question:
1. What to do in cases there is no database installed in client location.
2. I do not want to install a full-fledged database application which takes a lot of space, ram, etc. (i.e. Resources) to run. 
3. Store data where ever I want to in a human readable way. So that I can pack the data along with the application. 
4. Let other application to use the datastored by the application.

### Q2. What this Database should do mainly?
**Answer >** This database has mainly 4 Operation it should perform. `CRUD`, that is Create, Read, Update, Delete.
- [x] Save (Done)
- [ ] Read
- [ ] Update
- [ ] Delete

### Q3. How does this Database work ? (In a Abstract Way)
**Answer >**
**Save Function :**
1. This base is only cabaple of `save` operation. For this, you need to specify the location in which you want to make the `VAULT`. 
2. Then only at first mention the classes you want to store the data of, let's call them `ENTITIES` following JPA Standards. It will then create a folder for each `ENTITIES` mentioned. If already present, it will not create a folder.
3. Then you just pass the object you want to save to the `save(Object)` function. Example: Like, say you want to save a `user` object. Then pass it like save(user).
4. Then it store the object as a JSON File in the folder with the class of the Object saved.

**Comming Up:** `update, delete, read` funtionality.

<hr>

Any queries: Please till in the `discussions tab`.
I will describe the workings of the database in a youtube vedio: `[<URL HERE>]`
