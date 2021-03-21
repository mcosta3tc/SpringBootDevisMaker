export default async function getClients (req, res){
    const clients = await fetch('http://localhost:8080/api/clients');
    const json = await clients.json();
    res.json(json)
}