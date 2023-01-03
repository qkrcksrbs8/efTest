package cg.park.testSpringBoot.git;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class GitTest {

    @Test
    public void git() {
        
        try {
            String command = "git log";
            Process process = Runtime.getRuntime().exec(command);

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            int cnt = 1;
            List<Git> list = new ArrayList<>();
            Git git = new Git();
            while ((line = reader.readLine()) != null) {

                if ("".equals(line)) continue;
                if (1 == cnt) {
                    git.setCommitId(line);
                }
                else if (2 == cnt) {
                    git.setUser(line);
                }
                else if (3 == cnt) {
                    git.setDate(line);
                }
                else if (4 == cnt) {
                    git.setMessage(line);
                    list.add(git);
                    cnt = 0;
                    git = new Git();
                }
                cnt++;
            }


            int exitCode = process.waitFor();
            System.out.println("\nExited with error code : " + exitCode);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class Git {
    private String commitId;
    private String user;
    private String Date;
    private String message;

    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
