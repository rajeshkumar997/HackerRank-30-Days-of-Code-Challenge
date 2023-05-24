function main() {
    const N = parseInt(readLine().trim(), 10);
    let output = [];
    const validateEmail = (email) => {
        return String(email)
            .toLowerCase()
            .match(/(\<|^)[\w\d._%+-]+@(?:[\w\d-]+\.)+(\w{2,})(\>|$)/i);
    };
    for (let NItr = 0; NItr < N; NItr++) {
        const firstMultipleInput = readLine().replace(/\s+$/g, '').split(' ');

        const firstName = firstMultipleInput[0];

        const emailID = firstMultipleInput[1];
        
        if(validateEmail(emailID)  && /@gmail\.com$/.test(emailID) ) output.push(firstName);
    }
    output.sort();
    output.forEach(item => {
        console.log(item);
    });
}
