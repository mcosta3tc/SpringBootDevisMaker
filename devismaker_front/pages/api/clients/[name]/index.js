export default async function getDevisByClient(req, res) {
    const devis = await fetch(`http://localhost:8080/api/clients/${req.query.name}`);
    const json = await devis.json();
    res.json(json)
}
