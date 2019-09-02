rs.initiate();
db = db.getSiblingDB('joska')
db.createUser(
    {
        user: 'spring-boot',
        pwd: 'xyz123',
        roles: [{ role: 'readWrite', db: 'joska' }]
    }
);
// mongodb://spring-boot:xyz123@127.0.0.1:27017/joska
