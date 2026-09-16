using System.Numerics;
using UnityEngine;

[System.Serializable]
public class PlayerStats
{
    public string name;
    public int strength;
}
public class MyFirstComponent : MonoBehaviour
{
    // Privates don't show in the editor
    // private float myPrivateVariable = 10;
    public float speed = 10;
    [SerializeField]
    public PlayerStats[] playerStats;
    // public float myPublicVariable = 50;
    // Start is called once before the first execution of Update after the MonoBehaviour is created
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        // Debug.Log(myPublicVariable);
        transform.position += new UnityEngine.Vector3(speed,0,0)*Time.deltaTime;


    }
}
