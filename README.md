# quantumAssemblyCompiler

How to Execute jj 
$javacc QuantumAssembly.jj
$javac *.java
$java QuantumAssembly < YourAssemblyClass.txt

Commands
INITIALIZE [QUBITS]
TENSOR varName register/gate register/gate
APPLY GATE register
SELECT varName register register

GATES
CNOT -> Controlled Not
H -> Hadamard
NOT -> Not

Special Gates Tensor
Hada -> Hadamard
Iden -> Identity
Cnot -> Controlled Not

