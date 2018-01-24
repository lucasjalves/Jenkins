pipeline
{
    agent any
    stages
    {
        stage('Build')
        {
            steps
            {
                echo 'Pipeline executando'
                build 'Teste'
            }
        }
        stage('Test')
        {
            steps
            {
                echo 'Executando testes...'
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }

}