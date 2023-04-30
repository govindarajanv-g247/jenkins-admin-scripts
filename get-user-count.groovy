import com.cloudbees.hudson.plugins.folder.Folder
import groovy.transform.Field
import hudson.model.Job
import hudson.model.User
import jenkins.model.Jenkins
import org.jenkinsci.plugins.workflow.multibranch.WorkflowMultiBranchProject


total_users = User.getAll().size()
