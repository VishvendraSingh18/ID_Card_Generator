document.getElementById('idCardForm').addEventListener('submit', async function(e) {
    e.preventDefault();
    const formData = new FormData(this);

    const idCardData = {
            name: document.querySelector('#name').value,
            rollNumber: document.querySelector('#rollNumber').value,
            bloodGroup: document.querySelector('#bloodGroup').value,
            validUpto: document.querySelector('#validUpto').value,
            course: document.querySelector('#course').value,
            developerId: document.querySelector('#developerId').value
        };
        console.log('ID Card Data:', idCardData);

//        console.log(formData);
    try {
        const response = await fetch('http://localhost:8080/api/idcards/upload', {
            method: 'POST',
            body: JSON.stringify(idCardData)
        });

        if (response.ok) {
            const data = await response.json();
            alert('ID Card created successfully!');
            console.log(data);
        } else {
            alert('Error creating ID card');
        }
    } catch (error) {
        console.error('Error:', error);
    }
});
